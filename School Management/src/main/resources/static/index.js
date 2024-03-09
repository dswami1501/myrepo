function toggleSidebar() {
  var sidebar = document.querySelector('.sidebar');
  sidebar.classList.toggle('collapsed');
}

// Include sidebar using JavaScript
function fetchSidebar(url) {
    fetch(url)
        .then(response => response.text())
        .then(html => {
            // Modify the HTML content
            console.log('Sidebar HTML content before:', html);
            html = modifyHTML(html);
            console.log('Sidebar HTML content after:', html);
            document.getElementById('sidebar-placeholder').innerHTML = html;
        })
        .catch(error => console.error('Error fetching sidebar:', error));
}

function modifyHTML(newHtmlContent) {
// Fetch protocol, host, and port
var protocol = window.location.protocol;
var host = window.location.hostname;
var port = window.location.port;

// Construct the base URL
var classURL = protocol + '//' + host;
var stuURL = protocol + '//' + host;
if (port) {
    classURL += ':' + port;
    stuURL += ':' + port;
}
classURL += '/services/class/classDetails.html';
stuURL += '/services/student/studentDetails.html';
newHtmlContent = newHtmlContent.replace(/#classroom/g, classURL);
newHtmlContent = newHtmlContent.replace(/#student/g, stuURL);
return newHtmlContent;
}