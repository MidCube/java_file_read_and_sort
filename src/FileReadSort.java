import java.io.*;

public class FileReadSort {

    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);

        BufferedReader br = new BufferedReader(new FileReader(file));

        int count = 0;
        while ((br.readLine()) != null) {
            count++;
        }
        br.close();
        String[] filearray = new String[count];
        file = new File(args[0]);
        br = new BufferedReader(new FileReader(file));

        for (int i = 0; i<count;i++) {
            filearray[i] = br.readLine();
        }
        String[][] filearray2D = new String[count][2];
        for(int i = 0; i<count;i++) {
            String[] linePieces = filearray[i].split(",");
            filearray2D[i] = linePieces;
        }
        bubbleSort(filearray2D);
        print2d(filearray2D);


    }

    static void bubbleSort(String[] arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j][0].compareTo(arr[j+1][0]) > 0 || (arr[j][0].compareTo(arr[j+1][0]) == 0 && arr[j][1].compareTo(arr[j+1][1]) > 0))
                {// swap arr[j+1] and arr[i]
                    String[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    static void print2d(String[][] printme) {
        int n = printme.length;
        for (int i=0;i<n;i++) {
            System.out.println(printme[i][0]+", "+printme[i][1]);
        }
    }
}

