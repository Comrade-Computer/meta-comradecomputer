DESCRIPTION = "Copy scripts to profile.d"
LICENSE = "CLOSED"
SRC_URI = "file://lang.sh"

GLIBC_GENERATE_LOCALES = "en_US.UTF-8"
IMAGE_LINGUAS = "en-us"

RDEPENDS:${PN} = " bash"

do_install () {
        install -d ${D}/etc/profile.d
        install -m755 ${WORKDIR}/sources/lang.sh ${D}/etc/profile.d
}

