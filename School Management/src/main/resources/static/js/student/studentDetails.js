function searchStudent() {
    const studentId = document.getElementById('searchInput').value;
    const url = `/school/student/getstud/${studentId}`;

    fetch(url)
        .then(response => response.json())
        .then(data => {
            const studentList = document.getElementById('studentList');
            studentList.innerHTML = ''; // Clear previous student details

            if (typeof data === 'object') {
                const studentElement = document.createElement('div');
                studentElement.classList.add('student');

                const nameElement = document.createElement('div');
                nameElement.classList.add('name');
                nameElement.textContent = `Name: ${data.name}`;

                const addressElement = document.createElement('div');
                addressElement.classList.add('address');
                addressElement.textContent = `Address: ${data.address}`;

                const dateOfJoiningElement = document.createElement('div');
                dateOfJoiningElement.classList.add('dateOfJoining');
                dateOfJoiningElement.textContent = `DateOfJoining: ${data.dateOfJoining}`;

                const parentNameElement = document.createElement('div');
                parentNameElement.classList.add('parentName');
                parentNameElement.textContent = `ParentName: ${data.parentName}`;

                const phoneElement = document.createElement('div');
                phoneElement.classList.add('phone');
                phoneElement.textContent = `Phone: ${data.phone}`;

                const sexElement = document.createElement('div');
                sexElement.classList.add('sex');
                sexElement.textContent = `Sex: ${data.sex}`;

                const emailElement = document.createElement('div');
                emailElement.classList.add('email');
                emailElement.textContent = `Email: ${data.email}`;

                const dobElement = document.createElement('div');
                dobElement.classList.add('dob');
                dobElement.textContent = `Date of Birth: ${data.dob}`;

                // Create elements for other fields
                const classroomsElement = document.createElement('div');
                classroomsElement.classList.add('classrooms');
                classroomsElement.textContent = `Classrooms: `;
                if (data.classrooms && data.classrooms.length > 0) {
                    data.classrooms.forEach(classroom => {
                        const classroomInfo = `Grade ${classroom.grade} - ${classroom.section}`;
                        const classroomElement = document.createElement('span');
                        classroomElement.textContent = `${classroomInfo}, `;
                        classroomsElement.appendChild(classroomElement);
                    });
                } else {
                    classroomsElement.textContent = `Classrooms: None`;
                }


                const resultsElement = document.createElement('div');
                resultsElement.classList.add('results');
                resultsElement.textContent = `Results: `;
                data.results.forEach(result => {
                    const resultElement = document.createElement('span');
                    resultElement.textContent = `${result.name}, `;
                    resultsElement.appendChild(resultElement);
                });

                const attendancesElement = document.createElement('div');
                attendancesElement.classList.add('attendances');
                attendancesElement.textContent = `Attendances: `;
                data.attendances.forEach(attendance => {
                    const attendanceElement = document.createElement('span');
                    attendanceElement.textContent = `${attendance.date}, `;
                    attendancesElement.appendChild(attendanceElement);
                });

                const issuesElement = document.createElement('div');
                issuesElement.classList.add('issues');
                issuesElement.textContent = `Issues: `;
                data.issues.forEach(issue => {
                    const issueElement = document.createElement('span');
                    issueElement.textContent = `${issue.details}, `;
                    issuesElement.appendChild(issueElement);
                });

                // Append elements to student container
                studentElement.appendChild(nameElement);
                studentElement.appendChild(emailElement);
                studentElement.appendChild(dobElement);
                studentElement.appendChild(addressElement);
                studentElement.appendChild(dateOfJoiningElement);
                studentElement.appendChild(parentNameElement);
                studentElement.appendChild(phoneElement);
                studentElement.appendChild(sexElement);
                studentElement.appendChild(classroomsElement);
                studentElement.appendChild(resultsElement);
                studentElement.appendChild(attendancesElement);
                studentElement.appendChild(issuesElement);

                studentList.appendChild(studentElement);
            } else {
                console.error('Invalid data structure:', data);
            }
        })
        .catch(error => {
            console.error('Error fetching student data:', error);
        });
}

