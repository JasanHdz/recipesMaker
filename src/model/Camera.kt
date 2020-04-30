package model

class Camera {
    private var isOn: Boolean = false
    private var resolution: Int = 1080

    fun setResolution(resolution: Int) {
        this.resolution = resolution
    }

    fun getResolutin(): Int {
        return this.resolution
    }

    fun turnOn() {
        this.isOn = true
    }

    fun turnOff() {
        this.isOn = false
    }

    fun getCameraStatus(): String {
        return if (isOn) "Camera is Turned" else "Camera is not Turned"
    }
}