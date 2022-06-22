package ioTests.Task6;

import java.util.List;

public class Members {
        private String name;
        private int age;
        private String secretIdentity;
        private List<String> powers;

    public Members(String name, int age, String secretIdentity, List<String> powers) {
        this.name = name;
        this.age = age;
        this.secretIdentity = secretIdentity;
        this.powers = powers;
    }

        public String getName() { return name; }

        public int getAge() {return age;}

        public String getSecretIdentity() { return secretIdentity; }

        public List<String> getPowers() { return powers; }


    @Override
        public String toString() {
            return "Members{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", secretIdentity='" + secretIdentity + '\'' +
                    ", powers=" + powers +
                    '}';
    }
}

