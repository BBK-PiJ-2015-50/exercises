import java.util.Arrays

Matrix matrix = new Matrix(4,5);
println"\nCreate & initialise matrix";
println(matrix.toString() + "\n");
println(Arrays.toString(matrix))
matrix.prettyPrint();

println"\nModify one element";
matrix.setElement(3,4,5);
println(matrix.toString() + "\n");
println(Arrays.toString(matrix))
matrix.prettyPrint();

println"\nModify a whole row";
matrix.setRow(0,"5,3,0,7,3");
println(matrix.toString() + "\n");
println(Arrays.toString(matrix))
matrix.prettyPrint();

println"\nModify a whole column";
matrix.setColumn(2,"8,8,8,8");
println(matrix.toString() + "\n");
println(Arrays.toString(matrix))
matrix.prettyPrint();