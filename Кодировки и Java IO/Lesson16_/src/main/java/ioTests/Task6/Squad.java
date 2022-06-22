package ioTests.Task6;

import java.util.List;

public class Squad {
        private String squadName;
        private String homeTown;
        private int formed;
        private String secretBase;
        private boolean active;
        private List<Members> members;

        public String getSquadName() { return squadName; }
        public void setSquadName(String squadName) { this.squadName = squadName; }

        public String getHomeTown() { return homeTown; }
        public void setHomeTown(String homeTown) { this.homeTown = homeTown; }

        public int getFormed() { return formed; }
        public void setFormed(int formed) { this.formed = formed; }

        public String getSecretBase() {return secretBase;}
        public void setSecretBase(String secretBase) { this.secretBase = secretBase; }

        public boolean isActive() { return active; }
        public void setActive(boolean active) { this.active = active; }

        public List<Members> getMembers() { return members; }
        public void setMembers(List<Members> members) { this.members = members; }

        @Override
        public String toString() {
            return "Squad{" +
                    "squadName='" + squadName + '\'' +
                    ", homeTown='" + homeTown + '\'' +
                    ", formed=" + formed +
                    ", secretBase='" + secretBase + '\'' +
                    ", active=" + active +
                    ", members=" + members +
                    '}';
        }
}
