package com.lax.uppgift1;

import java.util.ArrayList;
import java.util.List;

public class NumbersInRange {

    public int start;
    public int end;
    public int stepNum;
    public int multiple;
    public List result = new ArrayList<>();
    public int count = 0;


    public NumbersInRange(int start, int end, int stepNum, int multiple) {
        this.start = start;
        this.end = end;
        this.stepNum = stepNum;
        this.multiple = multiple;
    }

    public List NumbersInRangeFunction() {
        if (start > end && stepNum >= 1) {
            if (multiple <= 0) {
                for (int i = start; i > end - 1; i = i - stepNum) {
                    result.add(i);
                }
            } else {
                for (int i = start; i > end - 1; i = i - stepNum) {
                    if (i % multiple == 0) {
                        result.add("Apendo!");
                        count++;
                    } else
                        result.add(i);
                }
            }
        }
        if (stepNum >= 1) {
            if (multiple == 0) {
                for (int i = start; i < end + 1; i = i + stepNum) {
                    result.add(i);
                }
            } else {
                for (int i = start; i < end + 1; i = i + stepNum) {
                    if (i % multiple == 0) {
                        result.add("Apendo!");
                        count++;
                    } else
                        result.add(i);
                }
            }
        }

        return result;
    }

    public String AdvancedResults(){
        String numberInIndex = result.get(stepNum-1).toString();
        return "The number in the index is: " + numberInIndex + "\n" + "Apendo appeard " + count + " times in this range";
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStepNum() {
        return stepNum;
    }

    public void setStepNum(int stepNum) {
        this.stepNum = stepNum;
    }

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }
}
