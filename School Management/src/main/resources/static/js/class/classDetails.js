function searchClassroom() {
    const classroomId = document.getElementById('searchInput').value;
    const url = `/school/classroom/getclass/${classroomId}`;

    fetch(url)
        .then(response => response.json())
        .then(data => {
            const classroomDetails = document.getElementById('classroomDetails');
            classroomDetails.innerHTML = ''; // Clear previous classroom details

            if (typeof data === 'object') {
                const classroomElement = document.createElement('div');
                classroomElement.classList.add('classroom');

                // Create elements for classroom details
                const classroomIdElement = document.createElement('div');
                classroomIdElement.classList.add('classroomId');
                classroomIdElement.textContent = `Classroom ID: ${data.classroomId}`;

                const sectionElement = document.createElement('div');
                sectionElement.classList.add('section');
                sectionElement.textContent = `Section: ${data.section}`;

                const gradeElement = document.createElement('div');
                gradeElement.classList.add('grade');
                gradeElement.textContent = `Grade: ${data.grade}`;

                const teacherElement = document.createElement('div');
                teacherElement.classList.add('teacher');
                teacherElement.textContent = `Teacher: ${data.teacher}`; // Assuming teacher has a 'name' property

                const timetableElement = document.createElement('div');
                timetableElement.classList.add('timetable');
                timetableElement.textContent = `Timetable: ${data.timetable}`; // Assuming timetable has a 'name' property

                //add by me
                const studentsElement = document.createElement('div');
                studentsElement.classList.add('students');
                studentsElement.textContent = `Students: `;
                if (data.students && data.students.length > 0) {
                    data.students.forEach(student => {
                        const studentInfo = `${student.name} - ${student.email}`;
                        const studentElement = document.createElement('span');
                        studentElement.textContent = `${studentInfo}, `;
                        studentsElement.appendChild(studentElement);
                    });
                } else {
                    studentsElement.textContent = `Students: None`;
                }

                // Append elements to classroom container
                classroomElement.appendChild(classroomIdElement);
                classroomElement.appendChild(sectionElement);
                classroomElement.appendChild(gradeElement);
                classroomElement.appendChild(studentsElement)
                classroomElement.appendChild(teacherElement);
                classroomElement.appendChild(timetableElement);

                classroomDetails.appendChild(classroomElement);
            } else {
                console.error('Invalid data structure:', data);
            }
        })
        .catch(error => {
            console.error('Error fetching classroom data:', error);
        });
}
