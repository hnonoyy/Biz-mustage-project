const INPUT_INDEX = {
  ID: 0,
  PASSWORD: 1,
  NAME: 2,
  NICK: 3,
  EMAIL: 4,
  TEL: 5,
  BUTTON: 6,
};
const ERROR_MESSEGE = [
  "* ID 는 반드시 입력하세요",
  "* PASSWORD 는 반드시 입력하세요",
  "* 이름은 반드시 입력하세요",
  "* 이메일은 반드시 입력하세요",
  "* 전화번호는 반드시 입력하세요",
];

document.addEventListener("DOMContentLoaded", () => {
  const join_form = document.querySelector("form.user.join");
  const join_inputs = join_form.querySelectorAll("input");
  const error_inputs = join_form.querySelectorAll("span");

  const emptyValid = (index) => {
    const text = join_inputs[index].value;
    if (!text) {
      error_inputs[index].textContent = ERROR_MESSEGE[index];
      error_inputs[index].style.display = "inline-block";
      join_inputs[index].select;
      return false;
    }
    return true;
  };

  const onJoinSubmit = () => {
    let yesValid = true;
    for (let i = 0; i < error_inputs.length; i++) {
      const span = error_inputs[i];
      span.style.display = "none";
      if (!(yesValid = emptyValid(i))) break;
    }
    if (yesValid) join_form.submit();
  };
  join_inputs[INPUT_INDEX.BUTTON].addEventListener("click", onJoinSubmit);
});
