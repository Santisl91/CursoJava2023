package Task_S1_07_Annotations.N2_Ex01;

@JSONSerializable(directory = "/Users/santiagosantos/IdeaProjects/CursoJava2023/Sprint1_Java_Language/src/main/java/Task_S1_07_Annotations/N2_Ex01/ArchivosJSon")
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}