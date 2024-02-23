document.getElementById('studentForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission
    const formData = new FormData(this); // Get form data
    const requestData = {};
    for (const [key, value] of formData.entries()) {
        requestData[key] = value;
    }
    fetch('/school/student/stud', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(requestData)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to create student');
        }
        return response.json();
    })
    .then(data => {
        console.log('Student created successfully:', data);
        // Optionally redirect to another page or show a success message
    })
    .catch(error => {
        console.error('Error creating student:', error);
        // Optionally show an error message to the user
    });
});
