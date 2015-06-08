SUMMARY = "Nemomobile's libngf-qt"
HOMEPAGE = "https://github.com/nemomobile/libngf-qt.git"
LICENSE = "LGPL-2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/nemomobile/libngf-qt.git;protocol=https"
SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCREV}"
S = "${WORKDIR}/git"

DEPENDS += " qtbase libngf"
inherit qmake5

do_install_append() {
    mv ${D}/lib/* ${D}/usr/lib/
    mv ${D}/include/* ${D}/usr/include/
    rmdir ${D}/include/
}
