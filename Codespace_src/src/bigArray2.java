// public class bigArray2 {
    
//     // 11. remove all cats under $26, print cat costs after
//     int i = 0;
//     while (i < numcats) {
//         if (cats[i].getCost() < 26) {
//             for (int j = i; j < numCats-1; j++) {
//                 cats[j] = cats[j+1];
//             }
//             numCats--;
//         } else {
//             i++;
//         }
//     }

//     System.out.println("\n11. The cats costing $26 or more actually cost: ");
//     for (int lcv = 0; lcv < numCats; lcv++) {
//         System.out.print(cats[lcv].getCost() + " ");
//     }
//     System.out.println();
//     for (Cat cat : cats) {

//     }
//     // 12. 
//     System.out.println("\nThe cats being put on a diet are: ");
//     for (int lcv = 0; lcv < numCats; lcv++) {
//         Cat cat = cats[lcv];
//         if (cat.getWeight() > 15) {
//             System.out.print(cat.getName() + "\t");
//         }
//     }
//     System.out.println();
// }
