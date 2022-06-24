import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjoon_2798 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int[size];
        st =new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }
        int sum=0;
        for(int i=0;i<size-2;i++){
            for(int j=i+1;j<size-1;j++){
                for(int k=j+1;k<size;k++){
                    if(arr[i]+arr[j]+arr[k]<=M&&arr[i]+arr[j]+arr[k]>sum)
                        sum =arr[i]+arr[j]+arr[k];
                }
            }
        }
        System.out.println(sum);
    }
}
