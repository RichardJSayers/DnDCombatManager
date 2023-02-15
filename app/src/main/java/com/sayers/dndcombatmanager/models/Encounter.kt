package com.sayers.dndcombatmanager.models

import io.realm.Realm
import io.realm.RealmList
import io.realm.RealmObject

class Encounter: RealmObject() {
    val rounds: RealmList<Round>? = null
}