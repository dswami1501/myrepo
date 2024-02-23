document.addEventListener('DOMContentLoaded', function() {
    const createClassroomForm = document.getElementById('createClassroomForm');

    createClassroomForm.addEventListener('submit', function(event) {
        event.preventDefault();

        const formData = new FormData(createClassroomForm);

        // Extract the values of the input fields
        const grade = formData.get('grade');
        const section = formData.get('section');
        const studentIds = formData.getAll('students'); // Get all values of 'students' input field
        const teacherId = formData.get('teacherId');
        const ttId = formData.get('ttId');

        // Construct the classroom object
        const classroomData = {
            grade: parseInt(grade), // Convert grade to integer
            section: section,
            students: studentIds.map(id => ({ studentId: parseInt(id) })), // Convert student IDs to integers and create objects
            teacherId: teacherId,
            ttId: ttId
        };

        // Log the constructed classroom object
        console.log('Classroom data:', classroomData);

        // Send the data to the server using fetch
        fetch('/school/classroom/saveclass', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(classroomData) // Convert classroomData object to JSON string
        })
        .then(response => response.json())
        .then(data => {
            console.log('Classroom created:', data);
            // Redirect to another page or show a success message
        })
        .catch(error => {
            console.error('Error creating classroom:', error);
            // Show an error message
        });
    });
});
