const LOGIN_INDEX = {
  ID: 0,
  PASSWORD: 1,
  BUTTON: 2,
};

const LOGIN_ERROR_MESSEGE = [
  "* 아이디를 입력해주세요",
  "* 비밀번호를 입력해주세요",
];

document.addEventListener("DOMContentLoaded", () => {
  const login_form = document.querySelector("form.user.login");
  const login_inputs = document.querySelectorAll("input");
  const error_inputs = document.querySelectorAll("span");

  const emptyValid = (index) => {
    const text = login_inputs[index].value;
    if (!text) {
      error_inputs[index].textContent = LOGIN_ERROR_MESSEGE[index];
      error_inputs[index].style.display = "inline-block";
      login_inputs[index].select;
      return false;
    }
    return true;
  };

  const onLoginSubmit = () => {
    let yesValid = true;
    for (let i = 0; i < error_inputs.length; i++) {
      const span = error_inputs[i];
      span.style.display = "none";
      if (!(yesValid = emptyValid(i))) break;
    }
    if (yesValid) login_form.submit();
  };
  login_inputs[LOGIN_INDEX.BUTTON].addEventListener("click", onLoginSubmit);
});
