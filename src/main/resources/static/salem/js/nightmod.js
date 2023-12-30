import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'
// import { createApp } from 'https://unpkg.com/petite-vue?module'

let firstNightAudioPlayerEl = document.getElementById("audio-nightmod-firstnight")
let initiatedAudioPlayerEl = document.getElementById("audio-nightmod-full")
let constableKilledAudioPlayerEl = document.getElementById("audio-nightmod-no-constable")

firstNightAudioPlayerEl.addEventListener('ended', () => {
    app.stopAudioPlayer()
}, false)
initiatedAudioPlayerEl.addEventListener('ended', () => {
    app.stopAudioPlayer()
}, false)
constableKilledAudioPlayerEl.addEventListener('ended', () => {
    app.stopAudioPlayer()
}, false)

let app = createApp({
    data(){
        return {
            isInitiated: true,

            isFirstNight: false,
            isFullRole: false,
            isConstableKilled: false,

            isAudioPlaying: false
        }
    },
    methods: {

        stopAudioPlayer() {
            firstNightAudioPlayerEl.pause()
            firstNightAudioPlayerEl.currentTime = 0
            initiatedAudioPlayerEl.pause()
            initiatedAudioPlayerEl.currentTime = 0
            constableKilledAudioPlayerEl.pause()
            constableKilledAudioPlayerEl.currentTime = 0
            this.isFirstNight = false
            this.isFullRole = false
            this.isConstableKilled = false
            this.isAudioPlaying = false
            this.isInitiated = true
        },

        playAudioPlayer(mode) {
            if (this.isAudioPlaying) {
                console.log(`Audio is Playing... Halted`)
                this.stopAudioPlayer()
                return;
            }
            console.log(`Play audio mode [${mode}]`)
            switch (mode) {
                case 'firstnight':
                    let firstNightAudioPlayerEl = document.getElementById("audio-nightmod-firstnight")
                    firstNightAudioPlayerEl.play()
                    this.isFirstNight = true
                    this.isFullRole = false
                    this.isConstableKilled = false
                    this.isInitiated = false
                    break;
                case 'full-role':
                    let initiatedAudioPlayerEl = document.getElementById("audio-nightmod-full")
                    initiatedAudioPlayerEl.play()
                    this.isFirstNight = false
                    this.isFullRole = true
                    this.isConstableKilled = false
                    this.isInitiated = false
                    break;
                case 'no-constable':
                    let constableKilledAudioPlayerEl = document.getElementById("audio-nightmod-no-constable")
                    constableKilledAudioPlayerEl.play()
                    this.isFirstNight = false
                    this.isFullRole = false
                    this.isConstableKilled = true
                    this.isInitiated = true
                    break;
            }
            this.isAudioPlaying = true
        }
    }
}).mount("#app")