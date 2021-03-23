# OOP

객체지향을 공부하며 Developer를 구현하는 2가지 버젼의 Code를 작성했습니다. 

첫번째는 'Has a' 관계로 '개발자는 직급(주니어, 시니어)을 가진다'는 형식로 구현하였으나
주요 객체인 Developer내의 Logic이 지저분해지고
Developer가 Action을 하는 것이 아니라 DeveloperRank가 Action을 하는 것이 부자연스럽게 느껴져 2번째 버젼으로 수정했습니다.

두번째는 'is a' 관계로 '주니어는 개발자다'라는 형식으로 
Developer를 상위 클래스로 두고 Junior, Senior 등을 하위 클래스로 하여 이를 상속 받는 형태로 바꾸었습니다.
