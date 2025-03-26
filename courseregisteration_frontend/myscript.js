function showCourses(){
    fetch("http://localhost:8080/courses") //API End point
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("coursetable")

        courses.forEach(course => {
            var row = `<tr>
            <td>${course.courseid}</td>
            <td>${course.coursename}</td>
            <td>${course.coursetrainer}</td>
            <td>${course.courseduration}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}

function showEnrolledStudents(){
    fetch("http://localhost:8080/students") //API End point
    .then((response) => response.json()) //Http response into json object
    .then((students) => {
        const dataTable = document.getElementById("enrolledtable")

        students.forEach(student => {
            var row = `<tr>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.course}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}