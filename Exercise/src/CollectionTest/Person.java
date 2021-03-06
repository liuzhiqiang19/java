package CollectionTest;

import java.util.Objects;

public class Person
{
    private String name;
    private int age;

    public Person()
    {
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int aMehtod()
    {
        return 0;
    }
    private void aMethod()
    {
        //
    }
    public static void aMethod1()
    {
        //
    }
    public final void aMethod2()
    {
        //
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    private String subName(String name)
    {
        String substring = name.substring(0, 3);
        return substring;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o)
    {
//        System.out.println("Person的equals()方法");

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age);
    }
}
