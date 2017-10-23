import java.util.Scanner;


/**
 * VectorHelper class uses for operations on a vector
 */
public  class VectorHelper {
    /**
     * This is a constructor to initialize VectorHelper object.
     */

    public VectorHelper() {
        // TODO Auto-generated constructor stub
    }
    /**
     * @param vector non sorted to be sorted
     * @return a sorted vector
     */
    public static int [] tri (int vector[]){
        /**
         * i index of a vector
         * j index of a vector
         * permut is a variable
         */
        int i,j = 0 ;
        int permut = 0 ;
        for (i=0 ; i<vector.length ; i++ ){
            for(j=i; j<vector.length ; j++ ){

                if (vector[j]<vector[i]){
                    permut=vector[i] ;
                    vector[i]=vector[j];
                    vector[j]=permut;
                }


            }
        }
        return ( vector ) ;
    }
    /**
     *Addition of two vectors
     * @param vector1 
     * @param vector2
     * @return a vector of integers as an addition of the two vectors vector1 and vector2
     * @throws LengthException in case vectors lengths are different 
     */
    public static int [] Somme (int vector1[],int vector2[] ) throws LengthException{
        int i  ;

        if (vector1.length != vector2.length) throw new LengthException() ;
        /**
         * Vector3 is generated from the addition of vector1 with vector2
         * i index to browse vectors
         */
        int vector3 [] = new int [vector1.length] ;
        for (i = 0 ; i < vector1.length ; i++ ){
            vector3[i] =vector1[i]+ vector2[i] ;
        }
        return(vector3);

    }
    /**
     *
     * @param vector to inverse
     * @return inverted vector
     */
    public static int [] InverserVector (int vector[]){
        /**
         * i index to browse a vector
         * j index to browse a vector
         * inverse variable
         */
        int i=0;
        int j=vector.length;
        int inverse;
        for (i=0;i<(vector.length)/2;i++ )
        {
            inverse = vector[i];
            vector[i]=vector[vector.length-i-1];
            vector[vector.length-i-1]=inverse;

        }

        return(vector) ;
    }

    /**
     * To extract the min and max of a vector in a vector of two cases.
     * @param vector to extract min and max from
     * @return a Vector of two cases , the lest one represents min and the right one is max
     */
    public static int[] MinMax (int vector[]){
        /**
         * min is minimum value of a vector
         * max is maximum value of a vector
         * i index to browse a vector
         */
         int min = vector[0] ;
        int max = vector[0] ;
        int i;
        for (i=1;i<vector.length;i++){
            if(vector[i]<min){
                min=vector[i];

            }
            else if (vector[i]>max){
                max=vector[i];
            }
        }
        
     int [] vecteur={min,max};
        return (vecteur);

    }
    /**

     * @param vector on which we apply a function
     * @return a vector after a function is applied on its elements every element power 2
     */
    public static int [] Formule (int vector []) {
        /**
         * i index to browse a vector
         */
        int i = 0 ;
        for(i=0 ; i< vector.length ; i++){
            vector[i]= vector[i]*vector[i];
        }

        return(vector);
    }
    /**
     * To show elements of a vector
     * @param vector to show
     */
    public static void AfficherVector(int vector[]) {
        /**
         * i index to browse a vector
         */
        for (int i = 0; i < vector.length; i++){

            System.out.println( vector[i]);
        }
    }
    /**
     * To fill a vector with integers
     * @param vector to fill
     * @return a filled vector
     */
    public static int[] RemplirVector ( int vector[] ) {
        /**
         * i index to browse a vector
         */

        Scanner keyb = new Scanner(System.in)	;
        for (int i = 0; i < vector.length; i++){
            vector[i] = keyb.nextInt();
        }
        return(vector);
    }




}
