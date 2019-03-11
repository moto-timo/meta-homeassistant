SUMMARY = "A python library for communicating with the Tradfri Gateway"
HOMEPAGE = "https://github.com/ggravlingen/pytradfri"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37ea2250f00b424609d55b35f829c514"

inherit pypi setuptools3

SRC_URI[md5sum] = "dcf5de7a5428c94d8d4673bb39e9c035"
SRC_URI[sha256sum] = "8e92254adc90e16d317988714a9f06669887e9a3f671c3d580c3c7e7535cb8c5"

RDEPENDS_${PN} = "\
    ${PYTHON_PN}-aiocoap \
    ${PYTHON_PN}-dtlssocket \
    "
