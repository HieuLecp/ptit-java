package J04017;

import java.util.*;

public class Matrix
{
    private int[][] arr;
    private int n, m;

    public Matrix(int n, int m)
    {
        this.arr = new int[n][m];
        this.n = n;
        this.m = m;
    }

    public void nextMatrix(Scanner sc)
    {
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                arr[i][j] = sc.nextInt();
    }

    public Matrix trans()
    {
        Matrix res = new Matrix(m, n);
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                res.arr[j][i] = arr[i][j];
        return res;
    }

    public Matrix mul(Matrix A)
    {
        Matrix res = new Matrix(n, A.m);
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < A.m; ++j)
                for (int z = 0; z < m; ++z)
                    res.arr[i][j] += this.arr[i][z] * A.arr[z][j];
        return res;
    }

    @Override
    public String toString()
    {
        String res = "";
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j)
                res += Integer.toString(arr[i][j]) + " ";
            res += "\n";
        }
        return res;
    }
}