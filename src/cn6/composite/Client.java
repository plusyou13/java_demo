package cn6.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//???С???????? ?У
		OrganizationComponent university = new University("?廪???", " ?й???????? ");
		
		//???? ??
		OrganizationComponent computerCollege = new College("???????", " ??????? ");
		OrganizationComponent infoEngineercollege = new College("?????????", " ????????? ");
		
		
		//????????????????(??)
		computerCollege.add(new Department("???????", " ?????????? "));
		computerCollege.add(new Department("???繤??", " ???繤????? "));
		computerCollege.add(new Department("????????????", " ????????????????????? "));
		
		//
		infoEngineercollege.add(new Department("??????", " ?????????? "));
		infoEngineercollege.add(new Department("???????", " ????????? "));
		
		//???????? ?У
		university.add(computerCollege);
		university.add(infoEngineercollege);
		
		//university.print();
		infoEngineercollege.print();
	}

}
