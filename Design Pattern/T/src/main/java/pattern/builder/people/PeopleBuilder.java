package pattern.builder.people;

import org.assertj.core.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PeopleBuilder {
    private Integer id;
    private String name;
    private String sex;
    private String race;
    private boolean isAdult;
    private int age;
    private List<String> address = new ArrayList<>();

    public People build() {
        return new People(id, name, sex, race, isAdult, age, address);
    }

    public People buildForTest() {
        if(id == null) {
            id = 1;
        }
        return new People(id, name, sex, race, isAdult, age, address);
    }

    public PeopleBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public PeopleBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PeopleBuilder withSex(String sex) {
        this.sex = sex;
        return this;
    }

    public PeopleBuilder withRace(String race) {
        this.race = race;
        return this;
    }

    public PeopleBuilder withIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
        return this;
    }

    public PeopleBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PeopleBuilder withAddress(String... address){
        this.address.add(String.valueOf(address));
        return this;
    }

}