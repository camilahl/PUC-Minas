//-----Accordion-----
const accordion = document.getElementsByClassName('contentBox');

for (i = 0; i < accordion.length; i++) {
    accordion[i].addEventListener('click', function () {
        this.classList.toggle('active')
    })
}

function funcContato() {
    location.replace(contato.html)
}

//-----Modal-----
const overlay = document.querySelector("#overlay");
document.querySelector("#show-modal-btn").addEventListener("click", () => {
    overlay.style.display = "block";
})

document.querySelector("#close-modal-btn").addEventListener("click", () => {
    overlay.style.display = "none";
})
