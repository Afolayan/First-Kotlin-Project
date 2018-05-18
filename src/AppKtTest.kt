

import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.junit.Arquillian
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.runner.RunWith

@RunWith(Arquillian::class)
class AppKtTest {

    @org.junit.Test
    fun feedTheFish() {
    }

    @org.junit.Test
    fun isTooHot() {
    }

    @org.junit.Test
    fun isDirty() {
    }

    @org.junit.Test
    fun isSunday() {
    }

    @org.junit.Test
    fun shouldChangeWater() {
    }

    @org.junit.Test
    fun swim() {
    }

    @org.junit.Test
    fun randomDay() {
    }

    @org.junit.Test
    fun fishFood() {
    }

    @org.junit.Test
    fun fitMoreFish() {
    }

    companion object {
        @Deployment
        fun createDeployment(): JavaArchive {
            return ShrinkWrap.create(JavaArchive::class.java)
                    //.addClass(AppKt::class.java)
                    .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
        }
    }
}
