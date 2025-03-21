// Get Elements
const umbrellaImg = document.getElementById("umbrella-img");
const logoImg = document.getElementById("logo-img");
const colorButtons = document.querySelectorAll(".color-btn");
const logoInput = document.getElementById("upload-logo");

// Color Change Functionality
colorButtons.forEach(button => {
    button.addEventListener("click", () => {
        const color = button.getAttribute("data-color");
        umbrellaImg.src = `assets/${color} umbrella.png`;
    });
});

// Logo Upload Functionality
logoInput.addEventListener("change", (event) => {
    const file = event.target.files[0];
    if (file) {
        const reader = new FileReader();
        reader.onload = function(e) {
            logoImg.src = e.target.result;
            logoImg.style.display = "block";  // Show logo after upload
        };
        reader.readAsDataURL(file);
    }
});
