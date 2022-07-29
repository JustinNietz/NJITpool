package com.example.njitpool;

public class DriverInfo {
        // string variable for
        // storing employee name.
        private String driverStart;

        // string variable for storing
        // employee address.
        private String driverDestination;

        // an empty constructor is
        // required when using
        // Firebase Realtime Database.
        public void driverInfo() {

        }

        // created getter and setter methods
        // for all our variables.
        public String getDriverInfo() {
            return driverStart;
        }

        public void setDriverStart(String driverStart) {
            this.driverStart = driverStart;
        }

        public String getDriverDestination() {
            return driverDestination;
        }

        public void setdriverDestination(String driverDestination) {
            this.driverDestination = driverDestination;
        }
    }

