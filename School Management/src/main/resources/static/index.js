function toggleSidebar() {
  var sidebar = document.querySelector('.sidebar');
  sidebar.classList.toggle('collapsed');
}

// Include sidebar using JavaScript
function fetchSidebar(url) {
fetch(url)
    .then(response => response.text())
    .then(html => document.getElementById('sidebar-placeholder').innerHTML = html)
    .catch(error => console.error('Error fetching sidebar:', error));
}