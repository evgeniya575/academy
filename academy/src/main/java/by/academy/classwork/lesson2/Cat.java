package by.academy.classwork.lesson2;

public class Cat {
	double money;
	int age;
	String nickname;

	
	public Cat() {
		super();
		
	}

		public Cat(int age) {
			super();
			this.age = age;
			
		}
		
		public Cat(int age, String nickname) {
			super();
			this.age = age;
			this.nickname = nickname;
		}
		
		public Cat(int age, String nickname, double money) {
			super();
			this.age =age;
			this.nickname = nickname;
			this.money = money;
			
		

		
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	
	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	
	public void sleep() {
	System.out.println("кот спит");
	}
	
	public void eat() {
		System.out.println("кот ест");
	}
	
	public void walk() {
		System.out.println("кот гуляет");
	}
	
		
		
	}
	
	
	
	



