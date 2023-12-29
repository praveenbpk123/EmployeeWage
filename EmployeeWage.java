Interface Family{
	members();
	childrens();
}

class JointFamily implements Family{
	members(){
	System.out.println("Welcome");
  }
	childrens(){
	System.out.println("Hello");
  }
}
