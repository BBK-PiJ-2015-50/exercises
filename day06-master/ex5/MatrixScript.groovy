println "\nCreate & initialise matrix";
Matrix matrix = new Matrix(4,5);
println(matrix.toString());
matrix.prettyPrint();

println "\nModify one element";
matrix.setElement(3,4,5);
matrix.prettyPrint();

println "\nModify a whole row";
matrix.setRow(0,"5,3,0,7,3");
matrix.prettyPrint();

println "\nModify a whole column";
matrix.setColumn(2,"8,8,8,8");
matrix.prettyPrint();

println "\nCreate new symmetrical matrix";
Matrix symMatrix = new Matrix(3,3);
symMatrix.setRow(0,"5,0,3");
symMatrix.setRow(1,"0,3,0");
symMatrix.setRow(2,"3,0,9");
symMatrix.prettyPrint();
println "Symmetrical?..." + symMatrix.checkSymmetrical();

println "\nCreate new non-symmetrical matrix";
Matrix nonSymMatrix = new Matrix(3,3);
nonSymMatrix.setRow(0,"5,0,7");
nonSymMatrix.setRow(1,"0,3,0");
nonSymMatrix.setRow(2,"3,0,9");
nonSymMatrix.prettyPrint();
println "Symmetrical?..." + nonSymMatrix.checkSymmetrical();
println "Triangular?..." + nonSymMatrix.checkTriangular();
println()

println "\nCreate triangular matrix";
Matrix triMatrix = new Matrix(3,3);
triMatrix.setRow(0,"5,4,7");
triMatrix.setRow(1,"0,3,2");
triMatrix.setRow(2,"0,0,9");
triMatrix.prettyPrint();
println "Triangular?..." + triMatrix.checkTriangular();
println()