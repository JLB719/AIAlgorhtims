package assignment;
public class dataStore {
    public double[][] dataStored;
    public dataStore(int i) {
        if (i == 1) {
        dataStored = solution1Data();
    } else if (i == 2) {
        dataStored = solution2Data();
    }
    }
public double[][] solution2Data() {
    double[][] data = new double[15][3];
    data[0][0] = 1;
    data[0][1] = 1;
    data[0][2] = 0;
    data[1][0] = 2;
    data[1][1] = 2;
    data[1][2] = 0;
    data[2][0] = 0.3;
    data[2][1] = 1.2;
    data[2][2] = 0;
    data[3][0] = 0.6;
    data[3][1] = 0.8;
    data[3][2] = 0;
    data[4][0] = 1.2;
    data[4][1] = 1;
    data[4][2] = 0;
    data[5][0] = 1.3;
    data[5][1] = 1;
    data[5][2] = 0;
    data[6][0] = 1.8;
    data[6][1] = 2;
    data[6][2] = 0;
    data[7][0] = 1.5;
    data[7][1] = 1.4;
    data[7][2] = 0;
    data[8][0] = 3;
    data[8][1] = 3;
    data[8][2] = 1;
    data[9][0] = 4;
    data[9][1] = 4;
    data[9][2] = 1;
    data[10][0] = 3.1;
    data[10][1] = 3.3;
    data[10][2] = 1;
    data[11][0] = 3.6;
    data[11][1] = 3.8;
    data[11][2] = 1;
    data[12][0] = 3.8;
    data[12][1] = 2.1;
    data[12][2] = 1;
    data[13][0] = 3.5;
    data[13][1] = 2.2;
    data[13][2] = 1;
    data[14][0] = 3.25;
    data[14][1] = 2.8;
    data[14][2] = 1;
    return data;
}
public double[][] solution1Data() {
    double[][] store = new double[10][2];
    store[0][0] = -100;
    store[0][1] = 9901;
    store[1][0] = -10;
    store[1][1] = 91;
    store[2][0] = -3;
    store[2][1] = 7;
    store[3][0] = 0;
    store[3][1] = 1;
    store[4][0] = 1;
    store[4][1] = 3;
    store[5][0] = 2;
    store[5][1] = 7;
    store[6][0] = 3;
    store[6][1] = 13;
    store[7][0] = 4;
    store[7][1] = 21;
    store[8][0] = 10;
    store[8][1] = 111;
    store[9][0] = 100;
    store[9][1] = 10101;
    return store;
}
}
