package patterns.factory;

import java.util.EnumMap;
import java.util.Optional;
import java.util.function.Supplier;

public final class KnifeFactory {

    private final static EnumMap<Knife.KnifeType, Supplier<Knife>> sKnifeMap =
            new EnumMap<>(Knife.KnifeType.class);

    static {
        sKnifeMap.put(Knife.KnifeType.HOUSEHOLD, HouseholdKnife::new);
        sKnifeMap.put(Knife.KnifeType.CHEF, ChefKnife::new);
        sKnifeMap.put(Knife.KnifeType.BUTCHER, createButchersKnife());
    }

    public static Knife createKnife(Knife.KnifeType type) throws IllegalArgumentException {
        return Optional.ofNullable(sKnifeMap.get(type)).map(Supplier::get).orElseThrow(IllegalArgumentException::new);
    }

    private static Supplier<Knife> createButchersKnife() {
        return ButcherKnife::new;
    }
}
