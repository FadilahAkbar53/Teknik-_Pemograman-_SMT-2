public class ShiftManager extends AbstractStoreEmployee {

    private double numberOfShifts;

    public ShiftManager(double numberOfHoursWorked, double hourlyRate, String storeDetails,
     double basePay, String employeeName, double numberOfShifts) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
        this.numberOfShifts = numberOfShifts;
    }

    @Override
    public double calculatePay() {
        return getBasePay() + getHourlyRate() * getNumberOfHoursWorked();
    }

    @Override
    public boolean checkPromotionEligibility() {
        return false;
    }

    // setter numberOfShifts
    public void setNumberOfShifts(int numberOfShifts) {
        this.numberOfShifts = numberOfShifts;
    }

    // numberOfShifts
    public double getNumberOfShifts() {
        return numberOfShifts;
    }

    @Override
    public String toString() {
        return super.toString() + "Shift Manager: " + getNumberOfShifts();
    }

    //method baru
     @Override
    public double divisionSalary() {
        double shiftSalary = calculatePay() + calculateBonusPay(); 
        return shiftSalary;
    }

    //Overide method abstrak interfaces Store
    @Override
    public boolean isFired(){
        if (getNumberOfHoursWorked()<30) {
            return true;
        }
        else{
            return false;
        }
    }
    
    //Overide method abstrak interfaces employee
    @Override
    public double calculateBonusPay() {
        if (getNumberOfHoursWorked() > 30) { 
            return getBasePay() * 0.10; 
        } else {
            return 0.0; 
        }
    }
}
