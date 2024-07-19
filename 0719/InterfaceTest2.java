interface IClick {
	void click();
}

class Button {
	IClick iClick;

	void onClick() {
		System.out.println("꾹 들어갔다 나옴");
		if (iClick != null) {
			iClick.click();
		}

	}

	public void addClickEventListener(IClick iClick) {
		this.iClick = iClick;
	}

}
//class LoginButton extends Button {
//	
//	@Override
//	void onClick() {
//		super.onClick();
//		System.out.println("로그인 처리");
//	}
//}

public class InterfaceTest2 {

	public static void main(String[] args) {
//		LoginButton button = new LoginButton();
//		button.onClick();

		Button button = new Button();

		button.addClickEventListener(new IClick() {

			@Override
			public void click() {
				System.out.println("로그인 처리");

			}
		}); // 인터페이스의 메서드를 구현까지 한걸 파라미터로 사용
		button.onClick();

//		위와 같이 파라미터로 보낸 내용을 풀어쓰면 아래와 같다.
//		IClick iClick = new IClick() {
//			
//			@Override
//			public void click() {
//				System.out.println("로그인 처리");
//				
//			}
//		};
//		button.addClickEventListener(iClick);
//		

		Button joinButton = new Button();
		joinButton.addClickEventListener(new IClick() {

			@Override
			public void click() {
				System.out.println("회원가입 처리");

			}
		});

		joinButton.onClick();
	}

}
