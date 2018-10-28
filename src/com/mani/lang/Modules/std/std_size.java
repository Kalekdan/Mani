package com.mani.lang.Modules.std;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mani.lang.Interpreter;
import com.mani.lang.ManiCallable;

public final class std_size implements ManiCallable {

    @Override
    public int arity() {
        return 1;
    }

    @Override
	public Object call(Interpreter interpreter, List<Object> arguments) {
        switch(arguments.get(0).getClass().getSimpleName().toLowerCase()) {
            case "string":
                return new Double(arguments.get(0).toString().length());
            case "arraylist":
                ArrayList<Object> arrayGiven = (ArrayList<Object>) arguments.get(0);
                return new Double(arrayGiven.size());
            case "hashmap":
                HashMap<Object, Object> given = (HashMap<Object, Object>) arguments.get(0);
                return new Double(given.size());
            
        }
        return null;
	}

}