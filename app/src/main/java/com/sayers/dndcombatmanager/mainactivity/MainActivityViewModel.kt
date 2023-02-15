package com.sayers.dndcombatmanager.mainactivity

import androidx.lifecycle.ViewModel
import com.sayers.dndcombatmanager.models.Encounter
import io.realm.Realm
import io.realm.RealmResults

class MainActivityViewModel: ViewModel() {

    private val realm = Realm.getDefaultInstance()

    fun createNewEncounter() {
        realm.executeTransaction{
            val encounter = Encounter()
            it.copyToRealmOrUpdate(encounter)
        }
    }

    fun getEncounters(): RealmResults<Encounter>? {
        return realm.where(Encounter::class.java).findAll()
    }
}