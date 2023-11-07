package Q2.Prog214bArray;

public class Cl214b {
    private double _YTDPay;      // 2nd number year to date pay
    private double _baseRate;
    private double _shiftCode;
    private double _hoursWorked;
    private double _gPay; // gross pay, hworked * pay rate(baseRate * shiftCode)
    private double _wTax; // witholding tax, gpay * tax rate(found on table)
    private double _ssTax; // social security tax, gross pay and ytd pay...
    private double _nPay; // net pay

    public Cl214b(double YTDPay, double bRate, double sCode, double hWorked) {       // takes in probably a lot
        _YTDPay = YTDPay;      // 2nd number year to date pay
        _baseRate = bRate;
        _shiftCode = sCode;
        _hoursWorked = hWorked;
        _gPay = 0; // gross pay
        _wTax = 0; // witholding tax
        _ssTax = 0; // social security tax
        _nPay = 0; // net pay
    }

    public void calc() {
        _gPay = _hoursWorked * (_baseRate * _shiftCode);
        if (_gPay < 100) {  // setting witholding tax
            _wTax = _gPay;
        } else if (100 <= _gPay && _gPay < 150) {       // numbers are the tax rate for each bracket
            _wTax = _gPay * 1.08;
        } else if (150 <= _gPay && _gPay < 200) {
            _wTax = _gPay * 1.12;
        } else if (200 <= _gPay && _gPay < 300) {
            _wTax = _gPay * 1.15;
        } else {
            _wTax = _gPay * 1.175;
        }
        if (_YTDPay > 17300) {     // setting social security tax
            // no ssTax
        } //else if () {
    }

}

