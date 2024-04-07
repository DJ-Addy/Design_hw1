
// This class is for an International Traveler. It has the following attributes:
public class international_traveler {
        private String name;
        private String passportNumber;
        private boolean isUSCitizen;
        private boolean hasValidVisa;
        private boolean hasCleanBackground;
        private boolean hasExplanationForMinorCrime;
        private boolean isBringingProhibitedItems;

        // Constructor
        public international_traveler(String name, String passportNumber, boolean isUSCitizen, boolean hasValidVisa,
                boolean hasCleanBackground, boolean hasExplanationForMinorCrime, boolean isBringingProhibitedItems) {
            this.name = name;
            this.passportNumber = passportNumber;
            this.isUSCitizen = isUSCitizen;
            this.hasValidVisa = hasValidVisa;
            this.hasCleanBackground = hasCleanBackground;
            this.hasExplanationForMinorCrime = hasExplanationForMinorCrime;
            this.isBringingProhibitedItems = isBringingProhibitedItems;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getPassportNumber() {
            return passportNumber;
        }

        public boolean isUSCitizen() {
            return isUSCitizen;
        }

        public boolean hasValidVisa() {
            return hasValidVisa;
        }

        public boolean hasCleanBackground() {
            return hasCleanBackground;
        }

        public boolean hasExplanationForMinorCrime() {
            return hasExplanationForMinorCrime;
        }

        public boolean isBringingProhibitedItems() {
            return isBringingProhibitedItems;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }
        
        public void setPassportNumber(String passportNumber) {
            this.passportNumber = passportNumber;
        }

        public void setUSCitizen(boolean isUSCitizen) {
            this.isUSCitizen = isUSCitizen;
        }

        public void setValidVisa(boolean hasValidVisa) {
            this.hasValidVisa = hasValidVisa;
        }

        public void setCleanBackground(boolean hasCleanBackground) {
            this.hasCleanBackground = hasCleanBackground;
        }

        public void setExplanationForMinorCrime(boolean hasExplanationForMinorCrime) {
            this.hasExplanationForMinorCrime = hasExplanationForMinorCrime;
        }

        public void setBringingProhibitedItems(boolean isBringingProhibitedItems) {
            this.isBringingProhibitedItems = isBringingProhibitedItems;
        }
        
    }
