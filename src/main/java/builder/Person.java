package builder;

public class Person {
    private String id;
    private String name;
    private String surname;
    private String sex;

    private Person(){}

    private Person(String id, String name, String surname, String sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public static class Builder{
        private String id;
        private String name;
        private String surname;
        private String sex;

        public Builder(){}

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder sex(String sex){
            this.sex = sex;
            return this;
        }

        public Person build(){
           return new Person(this.id, this.name, this.surname, this.sex);
        }

    }
}
