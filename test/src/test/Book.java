package test;

class Book implements CanRead{

	@Override
	public String showText() {
		// TODO Auto-generated method stub
		return "Book";
	}
	
	public static void main(String[] args) {
		People people = new People();
		people.read(new Book());
	}

}
