package spring_test04;

/**
 * Esta clase ha sido creada para que cuando en el BeansReferences.xml se nombra a:
 * <ref bean="address1"/> para ser inyectado en la lista, set, etc ...
 * debe declararse el bean en el xml el bean con id="address1" que desea inyectarse.
 * Para poder crear el bean debe indicarse un campo class, por este motivo se ha creado esta clase.
 * 
 * El método sobreescrito "toString()" es el que se utiliza cuando se listan los elementos de las listas, set, maps, etc ...
 * @author Jesus Campos
 *
 */
public class MyPerson {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "jajajjajajajjajaj";
	}
}
