package kozlyuk.structural.flyweight.lada;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class FlyweightLadaFactory {

    private static final Map<String, Vehicle> modelCache = new ConcurrentHashMap<>();

    public static Vehicle createVehicle(Model model, EquipmentGrade grade, Color color) {
        var modelKey = Vehicle.modelKey(model, grade, color);
        var v = modelCache.computeIfAbsent(modelKey, newModelKey -> new LadaFlyweight(123, model, color, grade));
        modelCache.put(modelKey, v);
        return v;
    }

    static int cacheSize() {
        return modelCache.size();
    }

}
