package v1;

import v1.utils.Person;

import javax.swing.*;
import java.util.ArrayList;

public class Model
{
    // Collect the values of the components, create a person and return it
    public Person add(JTextField jTextField, int age, JTextField jTextField2, JCheckBox jCheckBox)
    {
        String name = jTextField.getText();
        String home = jTextField2.getText();
        Boolean liveAlone = jCheckBox.isSelected();

        Person person = new Person(name, home, age, liveAlone);
        return person;
    }

    // Check if the person is already added
    public boolean check(ArrayList<Person> arrayList, Person person)
    {
        Boolean add = true;
        for (int i=0; i<arrayList.size(); i++)
        {
            Person a = arrayList.get(i);
            if (a.getName().equals(person.getName()))
            {
                add = false;
                break;
            }
        }
        return add;
    }

    // Delete a person
    public void deletePerson(ArrayList<Person> arrayList, Person person)
    {
        for (int i=0; i<=arrayList.size(); i++)
        {
            Person a = arrayList.get(i);
            if (a.getName().equals(person.getName()))
            {
                arrayList.remove(i);
                break;
            }
        }
    }
}
