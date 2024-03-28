// a
public String extractCity(String cityZip) {
    return cityZip.substring(0, cityZip.indexOf(",")); 
}
// b
public void printNames() {
    System.out.println(lines[0]); 
    for (int i = 1; i < lines.length(); i++) {
        if (lines[i-1].equals("")) {
            System.out.println(lines[i]); 
        }
    }
}
// c
public String getAddress(String name) {
    String addr = "No name found"; 
    int nameIndex = 0; 
    for (int lcv = 0; lcv < lines.length(); lcv++) {
        if (lines[lcv].equals(name)) {
            addr = lines[i+1]; 
        }
    }
    return addr; 
}