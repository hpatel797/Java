/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harshpatel_a3_accpayable.java;

/**
 *
 * @author hpatel797
 */
public class HarshPatel_A3_AccPayableJava { //This is the payroll system test

    public static void main( String[] args )
    {
    // create four-element Payable array
        Payable[] payableObjects = new Payable[ 6 ];
       // populate array with objects that implement Payable
        payableObjects[ 0 ] = new Invoice( "01234", "mirrors", 2, 375.00 );
        payableObjects[ 1 ] = new Invoice( "56789", "headlights", 4, 79.95 );
        payableObjects[ 2 ] =
        new SalariedEmployee( "Jack", "Black", "324-45-4352", 800.00 );
        payableObjects[ 3 ] =
        new HourlyEmployee( "Lauren", "Brown", "342-36-2346", 45, 40 );
        payableObjects[ 4 ] =
        new CommissionEmployee( "David", "Lee", "123-45-6789", 50, 0.3 );
        payableObjects[ 5 ] =
        new BasePlusCommissionEmployee( "Mary", "Poppins", "987-65-4321", 100, 0.2, 2000 );
        

        System.out.println(
        "Invoices and Employees processed polymorphically:\n" );

        // loop through each element in array payableObjects
        for ( Payable currentPayable : payableObjects )
        {
        // output currentPayable and its appropriate payment amount*/
            System.out.printf( "%s \n%s: $%,.2f\n\n",
            currentPayable.toString(),
            "payment due",currentPayable.getPaymentAmount());
            
            if (currentPayable instanceof BasePlusCommissionEmployee ) 
            {
                // downcast Employee reference to
                // BasePlusCommissionEmployee reference
               BasePlusCommissionEmployee employee =
               ( BasePlusCommissionEmployee ) currentPayable;          
               employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
                System.out.printf(
               "New base salary after 10%% increase: $%,.2f\n",
                employee.getBaseSalary() );
            } // end if
            System.out.printf(
            "earned $%,.2f\n\n",currentPayable.getPaymentAmount() );
        } // end for
    } // end main
 } // end class PayableInterfaceTest
