// a
public static int countA(WordSet s) {
    int As = 0; 
    for (int i = 1; i < s.size(); i++) {
        if (s.findkth(i).substring(0, 1).equals("A")) {
            As++; 
        }
    }
    return As; 
}
// b
public static void removeA(WordSet s) {
    for (int i = 1; i < s.size(); i++) {
        if (s.findkth(i).substring(0, 1).equals("A")) {
            s.remove(s.findkth(i)); 
        }
    }
}
// c
public static WordSet commonElements(WordSet s1, WordSet s2) {
    WordSet CE = new WordSet(); 
    for (int i = 0; i < s1.size(); i++) {
        for (int j = 0; j < s2.size(); j++) {
            if (s1.findkth(i).equals(s2.findkth(j))) {
                CE.insert(s1.findkth(i)); 
            }
        }
    }
    return CE; 
}


