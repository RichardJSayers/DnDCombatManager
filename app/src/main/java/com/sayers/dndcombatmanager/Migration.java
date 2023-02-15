package com.sayers.dndcombatmanager;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.FieldAttribute;
import io.realm.RealmDictionary;
import io.realm.RealmList;
import io.realm.RealmMigration;
import io.realm.RealmObjectSchema;
import io.realm.RealmResults;
import io.realm.RealmSchema;

public class Migration implements RealmMigration {
    @Override
    public void migrate(final DynamicRealm realm, long oldVersion, long newVersion) {

        // DynamicRealm exposes an editable schema
        RealmSchema schema = realm.getSchema();

        // Example of structure
//        if (oldVersion == 0) {
//            schema.get("Template")
//                    .renameField("hasRequirementCapas", "hasRequirementNonConformances");
//            oldVersion++;
//        }

        if (oldVersion < newVersion) {
            throw new IllegalStateException(String.format(Locale.UK, "Migration missing from v%d to v%d. Did you forget to add oldVersion++?", oldVersion, newVersion));
        }
    }
}
