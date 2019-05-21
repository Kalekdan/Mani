package com.mani.lang.Modules.maps;

import com.mani.lang.core.Interpreter;
import com.mani.lang.domain.ManiCallable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class maps_mapGetKeys implements ManiCallable {

    @Override
    public int arity() {
        return 1;
    }

    @Override
	public Object call(Interpreter interpreter, List<Object> arguments) {
		if (!(arguments.get(0) instanceof HashMap)) {
            return "Please make sure you have a map as your argument.";
        }
        ArrayList<Object> keys = new ArrayList<>();
        HashMap<Object, Object> given = (HashMap<Object, Object>) arguments.get(0);
        for (Object key : given.keySet()) {
            keys.add(key);
        }
        return keys;
	}

}