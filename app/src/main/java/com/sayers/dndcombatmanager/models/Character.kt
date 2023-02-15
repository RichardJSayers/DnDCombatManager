package com.sayers.dndcombatmanager.models

import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject

class Character: RealmObject {

    var name: String = "New Character"
    var encounters: RealmList<Encounter>? = null
}